import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class BankAccountGUI extends Application{
    private TextField name;
    private TextField newPin;
    private TextField logPin;
    private TextField amount;
    BankAccountClass userAccount;

    public void start(Stage stage){
      Font font = new Font(13);
    //Buttons
      Button depositBtn = new Button("Deposit");
      depositBtn.setOnAction(this::processDepositPress);

      Button withdrawBtn = new Button("Withdraw");
      withdrawBtn.setOnAction(this::processWithdrawPress);

      Button interestBtn = new Button("Interest");
      interestBtn.setOnAction(this::processInterestPress);

      Button createAccBtn = new Button("Create Account");
      createAccBtn.setOnAction(this::processCreatePress);

      Button showAccInfoBtn = new Button("Show Account Info");
      showAccInfoBtn.setOnAction(this::processShowInfoPress);

  //Text fields
      name = new TextField();
      name.setFont(font);
      name.setPrefWidth(85);
      name.setAlignment(Pos.CENTER);
      name.setOnAction(this::processName);

      newPin = new TextField();
      newPin.setFont(font);
      newPin.setPrefWidth(85);
      newPin.setAlignment(Pos.CENTER);
      newPin.setOnAction(this::processNewPin);

      logPin = new PasswordField();
      logPin.setFont(font);
      logPin.setPrefWidth(85);
      logPin.setAlignment(Pos.CENTER);

      amount = new TextField();
      amount.setFont(font);
      amount.setPrefWidth(85);
      amount.setAlignment(Pos.CENTER);


  //Labels
      Label startLabel = new Label("1. To create an account, fill in your information on the left two boxes and \n click the Create Account button. \n2. To use any of the remaining buttons, fill in your PIN and appropriate boxes.");

      Label nameLabel = new Label("Name:");
      nameLabel.setFont(font);

      Label newPinLabel = new Label("New PIN:");
      newPinLabel.setFont(font);

      Label pinLabel = new Label("PIN:");
      pinLabel.setFont(font);

      Label amountLabel = new Label("Deposit/Withdraw \n        Amount:");
      amountLabel.setFont(font);

      Label informationLabel = new Label("");
      informationLabel.setFont(font);

  //Flow Panes

      FlowPane startPane = new FlowPane(startLabel);
      startPane.setAlignment(Pos.CENTER);
      startPane.setHgap(20);
      startPane.setStyle("-fx-background-color: lightgrey");

      FlowPane labelPane = new FlowPane(nameLabel, newPinLabel, amountLabel, pinLabel);
      labelPane.setAlignment(Pos.CENTER);
      labelPane.setHgap(20);
      labelPane.setStyle("-fx-background-color: lightgrey");

      FlowPane textPane = new FlowPane(name, newPin, amount, logPin);
      textPane.setAlignment(Pos.CENTER);
      textPane.setHgap(20);
      textPane.setStyle("-fx-background-color: lightgrey");

      FlowPane buttonPane = new FlowPane(createAccBtn, interestBtn, depositBtn, withdrawBtn, showAccInfoBtn);
      buttonPane.setAlignment(Pos.CENTER);
      buttonPane.setHgap(20);
      buttonPane.setStyle("-fx-background-color: lightgrey");

      FlowPane infoPane = new FlowPane(informationLabel);
      infoPane.setAlignment(Pos.CENTER);
      infoPane.setHgap(20);
      infoPane.setStyle("-fx-background-color: lightgrey");

      GridPane griddestPane = new GridPane();
      griddestPane.add(startPane, 0, 0);
      griddestPane.add(labelPane, 0, 1);
      griddestPane.add(textPane, 0, 2);
      griddestPane.add(buttonPane, 0, 3);
      griddestPane.add(infoPane, 0, 4);

      griddestPane.setAlignment(Pos.CENTER);
      griddestPane.setVgap(10);
      griddestPane.setStyle("-fx-background-color: lightgrey");

      Scene scene = new Scene(griddestPane, 500, 300);

      stage.setTitle("Bank Account");
      stage.setScene(scene);
      stage.show();

    }

    private void processCreatePress(ActionEvent event){
      userAccount = new BankAccountClass(newPin.getText(), name.getText());
    }

    private void processDepositPress(ActionEvent event){
      userAccount.deposit(Double.parseDouble(amount.getText()));
    }

    private void processWithdrawPress(ActionEvent event){
      if(logPin.getText().compareTo(userAccount.getPIN()) == 0){
        userAccount.withdraw(Double.parseDouble(amount.getText()));
      }
      else{
        //set text box to say they have the wrong pin
      }
    }

    private void processShowInfoPress(ActionEvent event){
      if(logPin.getText().compareTo(userAccount.getPIN())==0){
        //show account info
      }
      else{
        //say wrong pin
      }
    }

    private void processInterestPress(ActionEvent event){
      userAccount.interest(1.0);
    }

    private void processName(ActionEvent event){
      userAccount.setName(name.getText());
    }

    private void processNewPin(ActionEvent event){
      userAccount.setPIN(newPin.getText());
    }
  }
