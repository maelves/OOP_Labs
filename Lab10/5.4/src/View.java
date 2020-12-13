import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class View extends JFrame {
    private JTextField sum = new JTextField(5);
    private JTextField converted = new JTextField(5);
    private JButton    convertBtn = new JButton("Convert");
    private JButton    clearBtn    = new JButton("Clear");
    private String[] curren = new String[] {"EUR", "RON",
            "USD"};

    private JComboBox<String> currency1 = new JComboBox<>(curren);
    private JComboBox<String> currency2 = new JComboBox<>(curren);

    private Model model;

    View(Model model1){
        model = model1;

        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());
        //content.add(new JLabel("Sum"));
        content.add(currency1);
        content.add(sum);
        content.add(currency2);
        content.add(converted);
        content.add(convertBtn);
        content.add(clearBtn);

        sum.setText(model.getValue());
        sum.setEditable(true);

        this.setContentPane(content);
        this.pack();

        this.setTitle("Exchange");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void showError(String errMessage) {
        JOptionPane.showMessageDialog(this, errMessage);
    }
    void reset() {
        sum.setText(Model.INITIAL_VALUE);
    }
    String getUserInput() {
        return sum.getText();
    }

    void addConverterListener(ActionListener mal) {
        convertBtn.addActionListener(mal);
    }

    void addClearListener(ActionListener cal) {
        convertBtn.addActionListener(cal);
    }

    void setTotal(String newTotal) {
        converted.setText(newTotal);
    }
}
