package Vista;


import Controlador.Controlador;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VistaHistorial {
    private JFrame frame;
    private JTextField txtUrl;
    private JTextField txtTitulo;
    private JLabel lblPaginaActual;
    private JButton btnVisitar;
    private JButton btnRetroceder;
    private JButton btnAvanzar;
    private Controlador controlador;

    public VistaHistorial(Controlador controlador) {
        this.controlador = controlador;
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Historial de Navegación");
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new GridLayout(5, 1));

        lblPaginaActual = new JLabel("Página Actual:");
        frame.getContentPane().add(lblPaginaActual);

        txtUrl = new JTextField(20);
        frame.getContentPane().add(txtUrl);

        txtTitulo = new JTextField(20);
        frame.getContentPane().add(txtTitulo);

        btnVisitar = new JButton("Visitar Página");
        btnVisitar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String url = txtUrl.getText();
                String titulo = txtTitulo.getText();
                controlador.visitarPagina(url, titulo);
                mostrarPaginaActual(titulo);
            }
        });
        frame.getContentPane().add(btnVisitar);

        btnRetroceder = new JButton("Retroceder");
        btnRetroceder.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controlador.retroceder();
            }
        });
        frame.getContentPane().add(btnRetroceder);

        btnAvanzar = new JButton("Avanzar");
        btnAvanzar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controlador.avanzar();
            }
        });
        frame.getContentPane().add(btnAvanzar);

        frame.setVisible(true);
    }

    public void mostrarPaginaActual(String titulo) {
        lblPaginaActual.setText("Página Actual: " + titulo);
    }

    public void mostrar() {
        frame.setVisible(true);
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }
}