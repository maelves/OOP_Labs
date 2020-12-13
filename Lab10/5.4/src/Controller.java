import java.awt.event.*;
import java.math.BigInteger;

public class Controller {
    private Model m_model;
    private View  m_view;

    Controller(Model model, View view) {
        m_model = model;
        m_view  = view;

        view.addConverterListener(new ConverterListener());
        view.addClearListener(new ClearListener());}


    class ConverterListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        String userInput = "";
        try {
            userInput = m_view.getUserInput();
            if(userInput.equals("EUR"))
                m_model.EURtoRON(BigInteger.valueOf(Long.parseLong(userInput)));
            else if(userInput.equals("USD"))
                m_model.USDtoRON(BigInteger.valueOf(Long.parseLong(userInput)));
            else
                m_model.RONtoEUR(BigInteger.valueOf(Long.parseLong(userInput)));
            m_view.setTotal(m_model.getValue());

        } catch (NumberFormatException nfex) {
            m_view.showError("Bad input: '" + userInput + "'");
        }
    }
    }

    class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            m_model.reset();
            m_view.reset();
        }
    }
}
