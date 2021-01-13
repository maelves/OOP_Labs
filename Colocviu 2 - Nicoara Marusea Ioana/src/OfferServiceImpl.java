import java.util.ArrayList;

public class OfferServiceImpl implements OfferService{

    ArrayList<Offer> offerts = new ArrayList<>();

    public OfferServiceImpl(ArrayList<Offer> offerts) {
        this.offerts = offerts;
    }

    public OfferServiceImpl() {
    }

    @Override
    public Product create(Product product) {
        return product;
    }

    @Override
    public ArrayList<Product> search(String name) {
        return null;
    }

    @Override
    public boolean delete(Offer product) throws ProductNotFoundException, OfferNotFoundException {
        return false;
    }

    @Override
    public boolean delete(Product entity) throws ProductNotFoundException {
        return false;
    }
/*
    @Override
    public boolean delete(Offer offer) throws OfferNotFoundException {
        if(offerts.remove(offer))
            return true;
        else
            throw new OfferNotFoundException("Offert not found!");

    }*/

    @Override
    public ArrayList<Offer> findAllByProductName(String name) {
        return null;
    }

    public ArrayList<Offer> getOfferts() {
        return offerts;
    }
}
