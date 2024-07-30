public class CustomerRepositoryImplementation implements CustomerRepository {
    @Override
    public Customer findCustomerById(int id) {
        return new Customer(id, "xyz");
    }
}
