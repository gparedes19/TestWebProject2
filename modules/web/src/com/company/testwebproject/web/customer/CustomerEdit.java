package com.company.testwebproject.web.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.testwebproject.entity.Customer;

@UiController("testwebproject_Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
@LoadDataBeforeShow
public class CustomerEdit extends StandardEditor<Customer> {
}