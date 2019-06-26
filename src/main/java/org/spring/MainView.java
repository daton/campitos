package org.spring;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.notification.Notification;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

@Route
@PWA(name = "Proyecto Base de Vaadin con Spring", shortName = "Proyecto JC")
public class MainView extends VerticalLayout {

    public MainView(@Autowired MessageBean bean) {
        
        
       
        FormLayout nameLayout = new FormLayout();

TextField titleField = new TextField();
titleField.setLabel("Title");
titleField.setPlaceholder("Sir");
TextField firstNameField = new TextField();
firstNameField.setLabel("First name");
firstNameField.setPlaceholder("John");
TextField lastNameField = new TextField();
lastNameField.setLabel("Last name");
lastNameField.setPlaceholder("Doe");

nameLayout.add(titleField, firstNameField, lastNameField);

nameLayout.setResponsiveSteps(
        new ResponsiveStep("0", 1),
        new ResponsiveStep("21em", 2),
        new ResponsiveStep("22em", 3));
        add(nameLayout);
         Button button = new Button("Apachurrame",
                e -> Notification.show(bean.getMessage()));
        add(button);
    }

}
