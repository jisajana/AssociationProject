import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.CacheRequest;

//our motive is not to lean GUI, but to see
//how the association is here
class HomeFrame extends JFrame implements ActionListener //isA
{
    JButton jb1 = new JButton("Existing User");//hasA
    JButton jb2 = new JButton("New User");//hasA

    public void actionPerformed(ActionEvent e) { //mandate
        if(e.getSource()==jb1) {
           // jb1.setEnabled(false);
            System.out.println("jb1 button is clicked");
            LoginFrame f =new LoginFrame();
            f.setTitle("Login");
            f.setLocation(100,200);
            f.setSize(380,190);
            f.setVisible(true);
        }
        else
           if(e.getSource()==jb2) {
             //  jb2.setEnabled(false);
               System.out.println("jb2 button is clicked");
               RegistrationFrame rg = new RegistrationFrame();
               rg.setTitle("Registration");
               rg.setLocation(400,400);
               rg.setSize(380,230);
               rg.setVisible(true);
           }

        // f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //  rg.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    HomeFrame() { //constructor here
        jb1.addActionListener(this); //button registration for event
        jb2.addActionListener(this);
        FlowLayout fl = new FlowLayout(); //free flow of all components
        setLayout(fl);
        add(jb1);add(jb2);
    }


}
class LoginFrame extends JFrame //isA
{
    JLabel jl1 = new JLabel("Enter username"); //hasA
    JLabel jl2 = new JLabel("Enter password"); //hasA
    JLabel jl3 = new JLabel("ReEnter password"); //hasA

    JTextField jt1 = new JTextField(20);//hasA
    JPasswordField jt2 = new JPasswordField(20);//hasA
    JPasswordField jt3 = new JPasswordField(20);//hasA

    JButton jb1 = new JButton("Login");//hasA
    JButton jb2 = new JButton("Reset");//hasA
    JButton jb3 = new JButton("Forgot Password");//hasA

    LoginFrame() { //constructor here
        FlowLayout fl = new FlowLayout(); //free flow of all components
        setLayout(fl);
        add(jl1); add(jt1);
        add(jl2); add(jt2);
        add(jl3); add(jt3);
        add(jb1);add(jb2);add(jb3);
    }

}

class RegistrationFrame extends JFrame //isA
{
    JLabel userLabel = new JLabel("Enter username"); //hasA
    JLabel passwordLabel = new JLabel("Enter password"); //hasA
    JLabel emailLabel = new JLabel("Enter Email"); //hasA
    JLabel phoneLabel = new JLabel("Enter Phone"); //hasA
    JLabel ageLabel = new JLabel("Enter Age"); //hasA

    JTextField username = new JTextField(20);//hasA
    JPasswordField password = new JPasswordField(20);//hasA
    JTextField email = new JTextField(20);//hasA
    JTextField phone = new JTextField(20);//hasA
    JTextField age = new JTextField(20);//hasA

    JButton registerButton = new JButton("Register");//hasA
    JButton resetButton = new JButton("Reset");//hasA
    JButton alreadyRegistered = new JButton("Login Existing Users");//hasA

    RegistrationFrame() { //constructor here
        FlowLayout fl = new FlowLayout(); //free flow of all components
        setLayout(fl);
        add(userLabel); add(username);
        add(passwordLabel); add(password);
        add(emailLabel); add(email);
        add(phoneLabel); add(phone);
        add(ageLabel); add(age);
        add(registerButton);add(resetButton);add(alreadyRegistered);
    }
}
//desktop application       vs      Enterprise application
// Frame                            Html+javascript+angular
//  local to this machine           global to any global user
public class AbstractTest {
    public static void main(String[] args) {

        HomeFrame hf = new HomeFrame();
        hf.setTitle("Home");
        hf.setLocation(100,100);
        hf.setSize(380,90);
        hf.setVisible(true);
        hf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


       /* Guitar g = new Guitar();
        g.pluck();
        g.tuneStrings();//implemented from the parent
        //g.switchOn();
        System.out.println("-------------");
        ElectronicGuitar eg = new ElectronicGuitar();
        eg.tuneStrings(); //inherited from the parent
        eg.pluck(); //inherited + overridden
        eg.switchOn(); // exclusive function
*/
       // GeometricalShape g = new GeometricalShape();
       // Circle c = new Circle();


     }
}
abstract class StringBasedMusicalInstrument //collective name for // Sitar, Violin, Veena
{
    abstract void tuneStrings();//mandate over the child to implement this function
}
class Guitar  extends StringBasedMusicalInstrument
{
    void pluck() {
        System.out.println("plucking guitar strings...");
    }
    void tuneStrings(){ //mandatory implementation
        System.out.println("Tuning the guitar strings..");
    }
}
class ElectronicGuitar extends Guitar
{
    void pluck() { //overriding the parent method/function
        System.out.println("plucking electronic guitar strings...");
    }
    void switchOn() { //exclusive function here
        System.out.println("Switching on the current..for Electronic Guitar...");
    }
}
abstract class GeometricalShape //not real one
{
//will meet at 21:40
}
class Circle extends GeometricalShape  //isA
{

}

//   //a GeometricalShape <-nothing such in reality
//        //Circle , Rectangle, Triangle<- real players

//collective name for these shapes
//BankAccount <- not in real - ABSTRACT
//real one -> Savings,Current,Fixed ...

//Game -> not in real - ABSTRACT
//IndoorGame --> not in real ABSTRACT
//TableTennis, Chess, Carom, -> REAL ONE

//OutDoorGame -> not in real - ABSTRACT
//FootBall, Soccer, BasketBall

//HAVE U SEEN ANY ABSTRACT DRAWING BY ANY PAINTER

// and we give some meaning to it
//may be its a cloud for Sajana
//may be a ghost to Lama
//may be a forest to Rajesh