package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    @GetMapping("/")
    public String home() {
        return """
<!DOCTYPE html>
<html lang="en">
<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Bakchod Team - Satish The Supreme</title>

<style>

body{
    margin:0;
    font-family:'Segoe UI',sans-serif;
    color:white;
}

.hero{

    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
    text-align:center;

    background:
    linear-gradient(
        rgba(0,0,0,0.6),
        rgba(0,0,0,0.8)
    ),
    linear-gradient(135deg,#ff512f,#dd2476);

}

.hero-content h1{

    font-size:70px;
    margin:0;

    text-shadow:
    0 0 20px yellow;

}

.ceo-name{

    font-size:45px;
    margin-top:25px;
    color:#ffd700;
    animation:glow 2s infinite;

}

.tagline{

    font-size:25px;
    margin-top:20px;
    color:#00ffcc;

}


.btn{

    display:inline-block;
    margin-top:40px;
    padding:15px 40px;
    background:#ffd700;
    color:black;
    border-radius:30px;
    font-weight:bold;

}


@keyframes glow{

    50%{

        text-shadow:
        0 0 30px #ffd700;

    }

}

</style>

</head>


<body>

<section class="hero">

<div class="hero-content">

<h1>
🔥 BAKCHOD TEAM 🔥
</h1>


<h2 class="ceo-name">
👑 CEO: SATISH THE SUPREME 👑
</h2>


<p class="tagline">

The World's Most Productive Timepass Organization

<br>

"99% Bakchodi | 1% Work | 100% Fun"

</p>


<a class="btn">
ENTER OFFICE UNIVERSE 🚀
</a>


</div>

</section>

</body>
</html>
""";
    }


    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}