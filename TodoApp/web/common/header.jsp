<header>
	<nav class="navbar navbar-expand-md navbar-dark"
	     style="background-color: rgb(156, 184, 231) ">
		<div>
			<a href="" class="navbar-brand" style="color: white"> Todo App</a>
		</div>

		<ul class="navbar-nav navbar-collapse justify-content-end">
			<li><a href="<%= request.getContextPath() %>/login" class="nav-link" style="color: white">
					Login</a></li>
			<li><a href="<%= request.getContextPath() %>/register" class="nav-link"style="color: white">
					Signup</a></li>
		</ul>
	</nav>
</header>