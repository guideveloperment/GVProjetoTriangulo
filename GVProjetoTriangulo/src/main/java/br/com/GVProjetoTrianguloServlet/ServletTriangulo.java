package br.com.GVProjetoTrianguloServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTriangulo
 */
@WebServlet("/ServletTriangulo")
public class ServletTriangulo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletTriangulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);

		double val1, val2, val3;
		double area = 0;
		

		val1 = Double.parseDouble(request.getParameter("val1"));
		val2 = Double.parseDouble(request.getParameter("val2"));
		val3 = Double.parseDouble(request.getParameter("val3"));

		if (val1 <= 0 && val2 <= 0 && val3 <= 0) {
			response.getWriter().println("Informe 3 valores positivos para verificação da existencia dos triangulos!");
		} else if (val1 < val2 + val3 && val1 < val1 + val3 && val3 < val1 + val2) {
			if (val1 == val2 && val2 == val3) {
				response.getWriter().println("TRIANGULO EQUILÁTERO!");
			} else if (val1 == val2 || val2 == val3 || val1 == val3) {
				response.getWriter().println("TRIÂNGULO ISÓCELES!");
			} else if (val1 != val2 && val1 != val3 && val3 != val2) {
				response.getWriter().println("TRIÂNGULO ESCALENO!");
			}
		} else {
			response.getWriter().println("NÃO CONSEGUE FORMAR UM TRIÂNGULO!");
		}

		if (val1 == 0 && val2 == 0 && val3 > 0) {
			response.getWriter().println("valor informado é uma reta " + val3);
		} else if (val2 == 0 && val3 == 0 && val1 > 0) {
			response.getWriter().println("Valor informado é uma reta " + val1);
		} else if (val1 == 0 && val3 == 0 && val2 > 0) {
			response.getWriter().println("Valor informado é uma reta " + val2);
		}
		
		
		double result;
		if (val1 == 0 && val2 > 0 && val3 > 0 && (val2 == val3)){
			result = val2 * val3;
			response.getWriter().println("Quadrado e a Area e igual a: " + result);
		}else if(val2 == 0 && val3 > 0 && val1 > 0 && (val1 == val3)) {
			result = val3 * val1;
			response.getWriter().println("Quadrado  e a Area e igual a:" + result);
		}else if(val3 == 0 && val1 > 0 && val2 > 0 && (val2 == val1)) {
			result = val2 * val1;
			response.getWriter().println("Qquadrado  e a Area e igual a:" + result);
		}
		else if(val3 == 0 && val1 > 0 && val2 > 0 && val1 > 0 && ( val1 != val2)) {
			result = val1 * val2;
			response.getWriter().println("Quadrado Retangulo e a Area e igual a:" + result);
		}
		else if(val2 == 0 && val3 > 0 && val1 > 0 &&  (val1 != val3)) {
			result = val1 * val3;
			response.getWriter().println("Quadrado Retangulo e a Area e igual a:" + result);
		}else if(val1 == 0 && val2 > 0 && val3 > 0 &&  (val2 != val3)) {
			result = val2 * val3;
			response.getWriter().println("Quadrado Retangulo");

		
		

	}

}
}
