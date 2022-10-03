# Forms

## Render the form

```java
@Controller
public class MainController {
	
	@RequestMapping("/display")
	public String index() {
		return "index.jsp";
	}
}
```
## form in `index.jsp`
```html
    <h3>Login</h3>
    <form action='/handle' method='GET'>
	<label>Email:</label>
    	<input type="text" name='email'>
	<label>Password:</label>
    	<input type='text' name='password'>
    	<input type='submit' value='handle'>
    </form>
```
## add route to handle form data
```java
public class MainController{
@RequestMapping("/handle")
public String login(
	@RequestParam(value="email") String email,
    @RequestParam(value="password") String password) {
    	return "results.jsp";
}
}
```

## change route for post and redirect
```java
public class MainController{
    @RequestMapping(value="/handle", method=RequestMethod.POST)
    public String login(
            @RequestParam(value="email") String email,
            @RequestParam(value="password") String password) {
        return "redirect:/dashboard";
    }
}
```

<a href="/display">display</a>