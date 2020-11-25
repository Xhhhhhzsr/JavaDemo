package Paa;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class App3 extends JFrame implements KeyListener {

        //图片
    private Icon icon, icon2;
    //图片容器
    private JLabel lab;
    //背景容器
    private JLabel labbg;
    private ImageIcon img;
    public App3(String s) {
        super(s);
        setSize(512, 720);
        //设置居中
        setLocationRelativeTo(null);
        JPanel contentPane = new JPanel(null);
        // contentPane.setLayout();
        setContentPane(contentPane);
        //添加背景图片
        img = new ImageIcon(this.getClass().getResource("./img/2.jpg"));
        //添加飞机1
        icon = new ImageIcon(this.getClass().getResource("./img/1.png"));
        lab = new JLabel(icon);
        lab.setBounds(0, 540,125, 125);
        labbg = new JLabel(img);
        labbg.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        addKeyListener(this);
        contentPane.add(lab);
        contentPane.add(labbg);
        setVisible(true);
        //禁止移动窗口
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public void keyTyped(KeyEvent e) {
// TODO Auto-generated method stub


    }


    @Override
    public void keyPressed(KeyEvent e) {
// TODO Auto-generated method stub
        //添加飞机2
        icon2 = new ImageIcon(this.getClass().getResource("./img/1.png"));
        lab.setIcon(icon2);

    }
    @Override
    public void keyReleased(KeyEvent e) {
        lab.setIcon(icon);
// TODO Auto-generated method stub
        int x = lab.getX();
        int y = lab.getY();
        if (x >= 412) {
            lab.setBounds(0, y, 125, 125);
        } else if (x < 0) {
            lab.setBounds(412, y, 125, 125);
        } else if (y < 0) {
            lab.setBounds(x, 0, 125, 125);
        } else if (y >600) {
            lab.setBounds(x, 0, 125, 125);
        } else {
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                lab.setBounds(x - 50, y, 125, 125);
            }
            if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                lab.setBounds(x + 50, y, 125, 125);
            }
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                lab.setBounds(x, y - 50, 125, 125);
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                lab.setBounds(x, y + 50, 125, 125);
            }
        }
    }
    public static void main(String[] args) {

        App3 mf = new App3("键盘事件之飞机移动");
    }

}






