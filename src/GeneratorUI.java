import javax.swing.*;
import java.awt.*;

public class GeneratorUI extends JFrame {
    Generator gnr = new Generator();
    JLabel password;
    public GeneratorUI(){
        super("Password Generator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500,500));
        setResizable(false);
        setLocationRelativeTo(null);
        addComponents();
        pack();
        setVisible(true);
    }

    private void addComponents(){
        SpringLayout spl = new SpringLayout();
        JPanel jpl = new JPanel();
        jpl.setLayout(spl);

        JButton gnrBtn = new JButton("Generate Password");
        jpl.add(gnrBtn);
        spl.putConstraint(SpringLayout.HORIZONTAL_CENTER, gnrBtn, 0, SpringLayout.HORIZONTAL_CENTER, jpl);
        spl.putConstraint(SpringLayout.VERTICAL_CENTER, gnrBtn, 0, SpringLayout.VERTICAL_CENTER, jpl);

        password = new JLabel("Password: ******");
        jpl.add(password);
        spl.putConstraint(SpringLayout.HORIZONTAL_CENTER, password, 0, SpringLayout.HORIZONTAL_CENTER, jpl);
        spl.putConstraint(SpringLayout.VERTICAL_CENTER, password, 40, SpringLayout.VERTICAL_CENTER, gnrBtn);

        //action listener to gnrBtn
        gnrBtn.addActionListener(e->{
            String newPassword = gnr.generate();
//            System.out.println("Password here" + password);
            password.setText("Password:" + newPassword);
        });



        add(jpl);




    }
}
