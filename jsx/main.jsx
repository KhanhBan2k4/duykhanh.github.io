const container = document.getElementById('root');

function App() {
    return (
        <div className="wrapper" onClick={() => {
            
        }}>
            <header>
                <h2>Name</h2>
                <nav>
                    <a id="home" href="#">Home</a>
                    <a id="contact" href="#">Contact</a>
                    <a id="about" href="#">About</a>
                    <a id="sevices" href="#">Sevices</a>
                    <button type="submit" className="btnSubmit">Login for free</button>
                </nav>
            </header>

            <div className="formHtml">
                <div className="form-login">
                    <h1>Login</h1>
                    <form action="#" method="get">
                        <div className="form-box">
                            <label htmlFor="email">Email</label>
                            <input type="email" name="email" id="email" required/>
                            <i className="fa-solid fa-envelope"></i>
                        </div>

                        <div className="form-box">
                            <label htmlFor="email">Password</label>
                            <input type="password" name="password" id="password" required/>
                            <i className="fa-solid fa-lock"></i>
                        </div>
                        
                        
                        <button type="submit">Login</button>
                        <p>You don't have account <a href="#">Sign up</a></p>
                    </form>
                </div>
            </div>
        </div>
    )
}

const root = ReactDOM.createRoot(container);
root.render(<App/>);