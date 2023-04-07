<h1 align="center">Servlet</h1>

<h3> ~~>> Servlet is simple Java Program that runs on server and capable of handling request and generating dynamic response.</h3>

<h3> --> Package of Servlet:-</h3>

<p> --> javax.servlets.Servlet</p>
<p> --> Servelt Interface have all the properties that a server need to have.</p>


<h2> --> Methods of Servlet:- </h2>

<p> 1. public abstract void init(javax.servlet.ServletConfig);</p>
<p> 2. public ServletConfig grtServletConfig();</p>
<p> 3. public void service(javax.servlet.ServletRequest, javax.servlet.ServletResponse);</p>
<p> 4. public abstract java.lang.String getServletInfo();</p>
<p> 5. public abstract void destroy();</p>
<p> --> init(), service() and destroy() these three methods are called servlet lifecycle method.</p>
<p> --> getServletConfig() method is sued to get configuration of the servlet.</p>
<p> --> getServletInfo() method is used to get information about the server.</p>
<p> --> Servelt is an interface so we have to create a user defined class then implements the servlet Interface and override all the methods.</p>


<h2> o) Another way to create Servlet:~~</h2>

<h3> >> GrnericServlet Class:-- </h3>

<p> --> GenericServlet is a abstract java class under (javax.servlet) package, this class implements the four abstract methods of the Servlet Interface except the service method. So when we estends GenericServlet class to create servlet then we don't need to override all the methods of Servlet Interface , just need to override the service method and this is easer than Implements the Servlet Interface. </p>

<h3> >> HttpServlet Class:-- </h3>

<p> --> HttpServlet is a abstract java class under (javax.servlet.http) package. All the Http related protocol specific functionality is provided by HttpServlet.</p>
<p> --> HttpServlet inherits GenericServlet class.</p>
<p></p>
<p></p>
<p></p>
