package part6_collections_va_lop_co_san.quanli_hang_doi_nganhang;

interface IBankQueue {
    boolean addCustomer(ICustomer customer);
    ICustomer serveNext();
    ICustomer peek();
    boolean isEmpty();
    int getQueueSize();
    java.util.List<ICustomer> getAllCustomers();
    int getCustomerPosition(String ticketNumber);
    java.util.List<ICustomer> getCustomersByService(String serviceType);
}
