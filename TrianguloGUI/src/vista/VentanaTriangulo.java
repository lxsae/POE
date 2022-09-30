
package vista;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import modelo.Triangulo;

/**
 *
 * @author Admin
 */
public class VentanaTriangulo extends JFrame implements ActionListener{
    
    private JLabel lblBase;
    private JLabel lblAltura;
    private JLabel lblArea;
    private JLabel lblPerimetro;
    private JTextField txtBase;
    private JTextField txtAltura;
    private JTextField txtArea;
    private JTextField txtPerimetro;
    private JButton btnCalcular;
    private JButton btnPerimetro;
    
    private Container contenedorPpal;
    
    public VentanaTriangulo(){
        iniciarComponentes();   
        setSize(600,200);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Área Triangulo");
    }
    
    private void iniciarComponentes(){
        

        //iniciamos los componenetes
        lblBase = new JLabel("Base : ");
        lblAltura = new JLabel("Altura : ");
        lblArea = new JLabel("Area : ");
        lblPerimetro = new JLabel("Perimetro: ");
        
        //Base
        BaseComp();
        /**
        txtBase = new JTextField(15);
        txtBase.setHorizontalAlignment(JTextField.RIGHT);
        */
        
        //Altura
        AlturaComp();
        /**
        txtAltura  = new JTextField(15);
        txtAltura.setHorizontalAlignment(JTextField.RIGHT);
        */
        
        
        //Area
        AreaComp();
        /**  
        txtArea  = new JTextField(15);
        txtArea.setEnabled(false);
        txtArea.setBackground(Color.blue);
        txtArea.setDisabledTextColor(Color.red);
        txtArea.setHorizontalAlignment(JTextField.RIGHT);
        */
        
        //Perimetro
        PerimetroComp();
        /**
        txtPerimetro  = new JTextField(15);
        txtPerimetro.setHorizontalAlignment(JTextField.LEFT);
        txtPerimetro.setEnabled(false);
        txtPerimetro.setBackground(Color.white);
        txtPerimetro.setDisabledTextColor(Color.red);
        txtPerimetro.setHorizontalAlignment(JTextField.LEFT);
        */
        
        //Botones
        BotonesComp();
        /**
        btnCalcular = new JButton("Area");
        btnPerimetro = new JButton("Perimetro");
        btnCalcular.addActionListener(this);
        btnPerimetro.addActionListener(this);
        */
               
        //Contenedor Principal
        ContenedorPrincipal();
        /**
        contenedorPpal = getContentPane();     
        contenedorPpal.setLayout(new GridLayout(5,2));        
        contenedorPpal.add(lblBase);
        contenedorPpal.add(txtBase);       
        contenedorPpal.add(lblAltura);
        contenedorPpal.add(txtAltura);        
        contenedorPpal.add(lblArea);
        contenedorPpal.add(txtArea); 
        contenedorPpal.add(lblPerimetro);
        contenedorPpal.add(txtPerimetro);
        contenedorPpal.add(btnCalcular); 
        contenedorPpal.add(btnPerimetro);
        */   
               
    }
    
    private void BaseComp(){
        txtBase = new JTextField(15);
        txtBase.setHorizontalAlignment(JTextField.RIGHT);
    
    }
    
    private void AreaComp(){
        txtArea  = new JTextField(15);
        txtArea.setEnabled(false);
        txtArea.setBackground(Color.YELLOW);
        txtArea.setDisabledTextColor(Color.BLACK);
        txtArea.setHorizontalAlignment(JTextField.RIGHT);
       
    }
    
    
    private void AlturaComp(){
        txtAltura  = new JTextField(15);
        txtAltura.setHorizontalAlignment(JTextField.RIGHT);
    
    }
    
    private void PerimetroComp(){
        txtPerimetro  = new JTextField(15);
        txtPerimetro.setHorizontalAlignment(JTextField.LEFT);
        txtPerimetro.setEnabled(false);
        txtPerimetro.setBackground(Color.BLUE);
        txtPerimetro.setDisabledTextColor(Color.WHITE);
        txtPerimetro.setHorizontalAlignment(JTextField.LEFT);
    
    
    }
    
    
    private void BotonesComp(){
        btnCalcular = new JButton("Area");
        btnPerimetro = new JButton("Perimetro");
        btnCalcular.addActionListener(this);
        btnPerimetro.addActionListener(this);
    
    
    
    }

    
    private void ContenedorPrincipal(){
        contenedorPpal = getContentPane();     
        contenedorPpal.setLayout(new GridLayout(5,2));        
        contenedorPpal.add(lblBase);
        contenedorPpal.add(txtBase);       
        contenedorPpal.add(lblAltura);
        contenedorPpal.add(txtAltura);        
        contenedorPpal.add(lblArea);
        contenedorPpal.add(txtArea); 
        contenedorPpal.add(lblPerimetro);
        contenedorPpal.add(txtPerimetro);
        contenedorPpal.add(btnCalcular); 
        contenedorPpal.add(btnPerimetro);
           
    
    
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == btnCalcular){
        float base = 0;
        float altura = 0;
        float area = 0;
        float perimetro = 0;
        
        Triangulo unTriangulo = new Triangulo();
        base = Float.parseFloat(txtBase.getText());
        altura = Float.parseFloat(txtAltura.getText());
        unTriangulo.setBase(base);
        unTriangulo.setAltura(altura);
        unTriangulo.calcularArea();
        area = unTriangulo.getArea();
       //txtArea.setText(String.valueOf(area));
        txtArea.setText(area+"");

           
    }else if(ae.getSource()==btnPerimetro){
        lblPerimetro.setText("Perimetro");
        txtPerimetro.setText("Se Calcula el perimetro");
        
    } 
    }  
}
