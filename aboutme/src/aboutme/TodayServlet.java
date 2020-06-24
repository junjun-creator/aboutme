package aboutme;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TodayServlet
 */
@WebServlet("/today")
public class TodayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TodayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int date= c.get(Calendar.DATE);
		out.write("<html><head><title>현재시간</title></head>");
		out.write("<body><a href='index3.html'>메인화면</a>");
		out.write("<h1 style=position:absolute;top:50%;transform:translateY(-50%);left:50%;transform:translateX(-50%);margin:0;padding:0;>");
		out.write("현재시간 : ");
		out.write(Integer.toString(year));
		out.write("/");
		out.write(Integer.toString(month+1));
		out.write("/");
		out.write(Integer.toString(date));
		out.write(" ");
		out.write(Integer.toString(hour));
		out.write(":");
		out.write(Integer.toString(minute));
		out.write("</h1></body></html>");
		out.close();
	}

	

}
