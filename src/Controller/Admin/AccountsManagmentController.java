/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Admin;

import View.ViewManager;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Yahya
 */
public class AccountsManagmentController implements Initializable {

   @FXML
    private Button updateSelectedAccountBtn;

    @FXML
    private TableColumn<?, ?> tccarrency;

    @FXML
    private TableColumn<?, ?> tcusername;

    @FXML
    private Button createNewAccountrBtn;

    @FXML
    private TableView<?> tableView;

    @FXML
    private Button accountsPageBtn;

    @FXML
    private TableColumn<?, ?> tccreation;

    @FXML
    private TableColumn<?, ?> tcnumber;

    @FXML
    private TableColumn<?, ?> tcbalance;

    @FXML
    private Button searchAccountBtn;

    @FXML
    private Button usersManagmentPageBtn;

    @FXML
    private Button operationsPageBtn;

    @FXML
    private Button showAllAccountsBtn;

    @FXML
    private TextField accontSearchTF;

    @FXML
    private TableColumn<?, ?> tcid;

    @FXML
    private Button deleteSelectedAccountBtn;

    @FXML
    void b8d9f8(ActionEvent event) {

    }

    @FXML
    void showUsersManagmentPage(ActionEvent event) {

    }

    @FXML
    void showAccountsPage(ActionEvent event) {

    }

    @FXML
    void showOperationsPage(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
             try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1.3306/bank","root","");
          this.statement = connection.createStatement();
            
        } catch (ClassNotFoundException ex) {
        ex.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(TextAreaPaneController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        tcid.setCellValueFactory(new PropertyValueFactory("id"));
        tcName.setCellValueFactory(new PropertyValueFactory("name"));
        tcDepar.setCellValueFactory(new PropertyValueFactory("department"));
        tcSalary.setCellValueFactory(new PropertyValueFactory("salary"));
    }

    

    @FXML
    void showAccountCreationPage(ActionEvent event) {

    }

    @FXML
    void showAllAccounts(ActionEvent event) {

    }

    @FXML
    void tableView(ActionEvent event) {

    }

    @FXML
    void updateSelectedAccount(ActionEvent event) {

    }

    @FXML
    void deleteSelectedAccount(ActionEvent event) {

    }

    @FXML
    void searchForAnAccount(ActionEvent event) {

    }

   
}