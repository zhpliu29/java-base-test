package a21responsibilitychain.before;

import a21responsibilitychain.PurchaseRequest;

public class Client {

    public static void main(String[] args) {

        PurchaseRequest request=new PurchaseRequest(102003.5);

        PurchaseRequestHandler purchaseRequestHandler=new PurchaseRequestHandler();
        purchaseRequestHandler.sendRequestToDirector(request);
    }
}
