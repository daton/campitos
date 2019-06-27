package org.spring;

import static com.vaadin.flow.component.Tag.H3;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Label;

import com.vaadin.flow.component.notification.Notification;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

@Route
@PWA(name = "Proyecto Base de Vaadin con Spring", shortName = "Proyecto JC")
public class MainView extends VerticalLayout {
@Autowired RepoProfesor repoProfesor;
    public MainView(@Autowired MessageBean bean) {
        
        H3 label=new H3("Guardar un nuevo profesor");
        add(label);
       
        FormLayout nameLayout = new FormLayout();

TextField campoCuenta = new TextField();
campoCuenta.setLabel("No.cuenta");
campoCuenta.setPlaceholder("cuenta del prof.");

TextField campoNombre = new TextField();
campoNombre.setLabel("Nombre");
campoNombre.setPlaceholder("Nombre del prof.");

EmailField campoEmail = new EmailField();
campoEmail.setLabel("Correo");
campoEmail.setPlaceholder("e-mail");

nameLayout.add(campoCuenta, campoNombre, campoEmail);

nameLayout.setResponsiveSteps(
        new ResponsiveStep("0", 1),
        new ResponsiveStep("21em", 2),
        new ResponsiveStep("22em", 3));
        add(nameLayout);
         Button botonGuardar = new Button("Guardar Profesor",
                e ->{
                    
                    Profesor profesor=
                            new Profesor(Integer.parseInt(campoCuenta.getValue())
                                    , campoNombre.getValue(), campoEmail.getValue());
                    repoProfesor.save(profesor);
                    Notification.show(bean.getMessage());
                
                });
         botonGuardar.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
         
        add(botonGuardar);
    }

}
