import java.util.*;
import javax.swing.* ;
import java.awt.event.*;
import java.awt.*;



public class Login extends ApplicationMain {
    
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JButton loginButton;
    private static String user = "User";
    private static String pass = "Password";
    private static String login = "login";
    
    
    
    public Login() {    
        super();
        setLayout(null);
        
        userLabel = new JLabel(user);
       
        userLabel.setBounds(10,20,80,25);
        add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        add(userText);

        passwordLabel = new JLabel(pass);
        passwordLabel.setBounds(10,50,80,25);
        add(passwordLabel);

      
        JPasswordField passwordText = new JPasswordField(20); //JPasswordField//
        passwordText.setBounds(100,50,165,25);
        add(passwordText);

        loginButton = new JButton(login);
        loginButton.setBounds(10, 80, 80, 25);
        getContentPane().add(loginButton);
        
        thehandler handler = new thehandler();
        userText.addFocusListener((FocusListener) handler);
        passwordText.addActionListener(handler);
        loginButton.addActionListener(handler);

        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 200);
        setVisible(true);
     }
     
    private void setLayout(Object object) {
		// TODO Auto-generated method stub
		
	}

	private Login getContentPane() {
		// TODO Auto-generated method stub
		return null;
	}

	private void add(JTextField userText2) {
		// TODO Auto-generated method stub
		
	}

	private void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

	private void setSize(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	private void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args){
        Login login1 = new Login();
       
    
    }
     
    private class thehandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            
            String user = userText.getText();
            String pass = new String(passwordText.getPassword());
            
            if(user == "John" && pass == "Doe"){
                JOptionPane.showMessageDialog(null, "nice");
            }

            else
       
                JOptionPane.showMessageDialog(null, "bad");
        }
 
    }
}