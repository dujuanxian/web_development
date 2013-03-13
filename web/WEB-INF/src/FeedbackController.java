import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FeedbackController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        if (!request.getParameter("feedback").toString().isEmpty()) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("feedback.jsp");
            dispatcher.forward(request, response);
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("feedback_failure.jsp");
            dispatcher.forward(request, response);
        }
    }
}
