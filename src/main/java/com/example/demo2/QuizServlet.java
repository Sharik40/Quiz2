package com.example.demo2;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "QuizServlet", value = "/quiz-servlet")
public class QuizServlet extends HttpServlet {
    static final String TEMPLATE = "<!DOCTYPE html><html>" +
            "<head><title>Answers</title></head>" +
            "<body>" +
            "<div><h3>Answer for first question</h3>" +
            "<p>Paris - %s</p>" +
            "<p>London - %s</p>" +
            "<p>Berlin - %s</p>" +
            "<p>Madrid - %s</p></div>" +
            "<div><h3>Answer for second question</h3>" +
            "<p>Earth - %s</p>" +
            "<p>Mars - %s</p>" +
            "<p>Venus - %s</p>" +
            "<p>Jupiter - %s</p></div>" +
            "</body></html>";

    private static List<String> quiz1 = new ArrayList<>();
    private static List<String> quiz2 = new ArrayList<>();
    private int paris_c, london_c, berlin_c, madrid_c, earth_c, mars_c, venus_c, jupiter_c;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out = resp.getWriter();
        out.println(String.format(TEMPLATE, paris_c, london_c, berlin_c, madrid_c, earth_c, mars_c, venus_c, jupiter_c));
        out.println("<a href=\"/account.jsp\">Back</a>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //Client client = new Client();
        paris_c = 0; london_c = 0; berlin_c = 0; madrid_c = 0; earth_c = 0; mars_c = 0; venus_c = 0; jupiter_c = 0;
        String q1 = req.getParameter("q1");
        String q2 = req.getParameter("q2");
        quiz1.add(q1);
        quiz2.add(q2);
        for (String quiz: quiz1) {
            switch (quiz) {
                case "paris": paris_c++; break;
                case "london": london_c++; break;
                case "berlin": berlin_c++; break;
                case "madrid": madrid_c++; break;
            }
        }
        for (String quiz2: quiz2) {
            switch (quiz2) {
                case "earth": earth_c++; break;
                case "mars": mars_c++; break;
                case "venus": venus_c++; break;
                case "jupiter": jupiter_c++; break;
            }
        }
        resp.sendRedirect("/account.jsp");
    }

    public static void clearAnswers() {
        quiz1.clear();
        quiz2.clear();
    }
}
