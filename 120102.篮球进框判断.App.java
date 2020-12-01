package Paa;

import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class App3 extends JFrame implements KeyListener {

        //图片
    private Icon icon, icon2;
    //图片容器
    private JLabel lab;
    //背景容器
    private JLabel labbg;
    private ImageIcon img;
    JLabel boeder1 = new JLabel();
    //得分lavel
    JLabel label_Score=new JLabel();
    //分数
    int score=0;
    public App3(String s) {
        super(s);
        setSize(720, 720);
        //设置居中
        setLocationRelativeTo(null);
        JPanel contentPane = new JPanel(null);
        // contentPane.setLayout();
        setContentPane(contentPane);
        //添加背景图片篮球框
        img = new ImageIcon(this.getClass().getResource("./img/bg_1.png"));
        //添加篮球1
        icon = new ImageIcon(this.getClass().getResource("./img/ball.png"));
        lab = new JLabel(icon);
        lab.setBounds(0, 540,130, 130);
        labbg = new JLabel(img);
        labbg.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        label_Score.setText("得分：0");
        label_Score.setBounds(500,0,300,100);
        //设置字体大小
        Font font = new Font("黑体", Font.BOLD, 30);
        label_Score.setFont(font);
                //窗体模块contentPane
        contentPane.add(label_Score);

        addKeyListener(this);
        contentPane.add(lab);
        contentPane.add(labbg);

        setVisible(true);
        //禁止移动窗口
       // setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void keyTyped(KeyEvent e) {
// TODO Auto-generated method stub
    }
    @Override
    public void keyPressed(KeyEvent e) {
// TODO Auto-generated method stub
        //添加篮球1
        icon2 = new ImageIcon(this.getClass().getResource("./img/ball.png"));
        lab.setIcon(icon2);
    }
    @Override
    public void keyReleased(KeyEvent e) {
        lab.setIcon(icon);
// TODO Auto-generated method stub
        int x = lab.getX();
        int y = lab.getY();
        if (x >= 412) {
            lab.setBounds(0, y, 130, 130);
            System.out.println("1");
        } else if (x < 0) {
            lab.setBounds(412, y, 130, 130);
            System.out.println("2");
        } else if (y < 0) {
            lab.setBounds(x, 0, 130, 130);
            System.out.println("3");
        } else if (y >600) {
            lab.setBounds(x, 0, 130, 130);
            System.out.println("4");
        } else {
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                lab.setBounds(x - 50, y, 130, 130);
                System.out.println("5");


            }
            if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                lab.setBounds(x + 50, y, 130, 130);
                System.out.println("5");

            }
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                lab.setBounds(x, y - 50, 130, 130);
                System.out.println("5");
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                lab.setBounds(x, y + 150, 130, 130);
                System.out.println("5");
            }
        }
        if (x>175&x<260&& y>230&y<330){
            score++;
            label_Score.setText("得分："+score);
        }


    }
    public static void main(String[] args) {

        App3 mf = new App3("键盘事件之投篮进框判断");
    }

}






