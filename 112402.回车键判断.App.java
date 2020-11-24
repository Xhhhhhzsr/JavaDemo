package Pac.Paa;


    import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

    public class App {
        JPanel myPanel = new JPanel();
        JLabel label_txt = new JLabel();
        JTextArea textArea_A = new JTextArea();
        JTextArea textArea_B = new JTextArea();

        //    构造方法;
        public App () {

                textArea_A.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyPressed(KeyEvent e) {
                        super.keyPressed(e);

                        if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                                textArea_A.getText().equals("张三");
                                if (textArea_A.getText().equals("张三")) {
                                    textArea_A.setText("");
                                    textArea_B.setText("回答正确");

                                } else {
                                    textArea_B.setText("回答错误");
                                }

                        }

                    }
                });

        }

        //显示常规方法
        void go() {
            textArea_A.setBounds(100, 100, 300, 100);
            textArea_A.setBackground(Color.YELLOW);
            textArea_B.setBounds(100, 200, 300, 100);
            textArea_B.setBackground(Color.PINK);
            myPanel.add(textArea_A);
            myPanel.add(textArea_B);
            JFrame frame = new JFrame("键盘监听");
            myPanel.setLayout(null);
            myPanel.add(label_txt);
            frame.setContentPane(myPanel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setBounds(100, 100, 512, 720);
            frame.setVisible(true);
        }

        public static void main(String[] args) {
            new App().go();
        }
    }


