

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class FormManager
 */
public class FormManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormManager() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/form.jsp");
        dispatcher.forward(req, resp);
	}




	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String type = request.getParameter("type");
		
		int price = 0;
		if(type.equalsIgnoreCase("Type-A"))
			price = quantity * 10;
		else if(type.equalsIgnoreCase("Type-B"))
			price = quantity * 20;
		else if(type.equalsIgnoreCase("Type-C"))
			price = quantity * 30;
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Price Details</h1>");
        out.println("<p>Type: " + type + "</p>");
        out.println("<p>Quantity: " + quantity + "</p>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("<p>Price: $" + price + "</p>");
        out.println("</body></html>");
	}

}
