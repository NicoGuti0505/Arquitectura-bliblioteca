package controlador;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import modelo.GestionUsuarios;

import java.io.IOException;

/**
 * Servlet implementation class C_Registro
 */
public class C_Registro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public C_Registro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre=request.getParameter("nombre");
		String apellido=request.getParameter("apellido");
		String id=request.getParameter("id");
		String edad=request.getParameter("edad");
		String telefono=request.getParameter("telefono");
		String direccion=request.getParameter("direccion");
		
		GestionUsuarios gu = new GestionUsuarios();
		gu.add(nombre,apellido,id,edad,telefono,direccion);
		
		response.getWriter().append("Se ha registrado el usuario");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
