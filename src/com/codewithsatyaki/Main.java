package com.codewithsatyaki;

import com.codewithsatyaki.command.intro.AddCustomerCommand;
import com.codewithsatyaki.command.intro.Button;
import com.codewithsatyaki.command.intro.Command;
import com.codewithsatyaki.command.intro.CustomerService;

public class Main {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        Command command = new AddCustomerCommand(service);
        Button button = new Button(command);

        button.click();
    }
}
