import javax.swing.*;
import java.awt.event.*;
 class SIandCI implements ActionListener{
JTextField rate,time,principle,ans;
JLabel jLabel1,jLabel2,jLabe3,jLabel4;
JButton ci,si;
SIandCI(){
    JFrame f= new JFrame("Simple and Compound Interest Calculator");
    rate=new JTextField();
    rate.setBounds(150,50,160,20);
    principle=new JTextField();
    principle.setBounds(150,100,160,20);
    time=new JTextField();
    time.setBounds(150,150,160,20);
    ans=new JTextField();
    ans.setBounds(150,200,160,20);
    ans.setEditable(false);
    si=new JButton("SI");
    si.setBounds(150,250,75,75);
    ci=new JButton("CI");
    ci.setBounds(235,250,75,75);
    jLabel1=new JLabel("Rate:");
    jLabel1.setBounds(10,50,125,20);
    jLabel2=new JLabel("Principle amount:");
    jLabel2.setBounds(10,100,125,20);
    jLabe3=new JLabel("Time in years:");
    jLabe3.setBounds(10,150,125,20);
    jLabel4=new JLabel();
    jLabel4.setBounds(10,200,125,20);
    f.add(rate);
    f.add(principle);
    f.add(time);
    f.add(ans);
    f.add(si);
    f.add(ci);
    f.add(jLabel1);
    f.add(jLabe3);
    f.add(jLabel4);
    f.add(jLabel2);
    f.setSize(500,500);
    f.setLayout(null);
    f.setVisible(true);
    si.addActionListener(this::actionPerformed);
    ci.addActionListener(this::actionPerformed);
}
    public static void main(String[] args) {
        new SIandCI();

    }

     @Override
     public void actionPerformed(ActionEvent e) {
         String intr=rate.getText();
         double rate=Double.parseDouble(intr);
         String amt=principle.getText();
         double amount=Double.parseDouble(amt);
         String dur=time.getText();
         double time=Double.parseDouble(dur);
         double answer=0;
         if(e.getSource()==si){
             jLabel4.setText("Simple Interest");
              answer=(rate*amount*time)/100;
         }
         if(e.getSource()==ci){
             jLabel4.setText("Compound Interest");
             answer=amount*(Math.pow((1+rate/100),time));
         }
         String result=String.valueOf(answer);
         ans.setText(result);
     }
 }
