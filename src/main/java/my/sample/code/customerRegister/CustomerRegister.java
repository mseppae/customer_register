package my.sample.code.customerRegister;

import java.util.ArrayList;
import org.simpleframework.xml.*;

@Root(name = "customers")
public class CustomerRegister {
    
    @ElementList(inline = true)
    private ArrayList<Customer> customerRegister = new ArrayList<Customer>();

    public ArrayList<Customer> customerList() {
        return customerRegister;
    }
}
