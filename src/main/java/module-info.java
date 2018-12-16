module prosppek {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires spring.core;
    requires spring.boot;
    requires spring.context;
    requires spring.boot.autoconfigure;
    requires spring.boot.starter;
    requires spring.beans;

    opens id.web.hikmasoft to javafx.fxml, spring.core;
    exports id.web.hikmasoft;
}