package com.company.testwebproject.web.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.testwebproject.entity.Customer;

@UiController("testwebproject_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowse extends StandardLookup<Customer> {
}