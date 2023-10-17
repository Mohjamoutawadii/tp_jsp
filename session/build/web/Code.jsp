<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Code de Vérification</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap/dist/css/bootstrap.min.css">
    <style>
        @import url('https://fonts.googleapis.com/css?family=Poppins:400,500,600,700&display=swap');

        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Poppins', sans-serif;
        }

        html, body {
            display: grid;
            height: 100%;
            width: 100%;
            place-items: center;
            background: linear-gradient(-135deg, #c850c0, #4158d0);
        }

        ::selection {
            background: #4158d0;
            color: #fff;
        }

        .container {
            width: 380px;
            background: #fff;
            border-radius: 15px;
            box-shadow: 0px 15px 20px rgba(0, 0, 0, 0.1);
            padding: 10px;
           
        }

        .container h2 {
            font-size: 35px;
            font-weight: 600;
            text-align: center;
            line-height: 100px;
            color: #fff;
            user-select: none;
            border-radius: 15px 15px 0 0;
            background: linear-gradient(-135deg, #c850c0, #4158d0);
            
        }

        .container form {
            padding: 10px 30px 50px 30px;
        }

        .container form .mb-3 {
            height: 50px;
            width: 100%;
            margin-top: 20px;
            position: relative;
        }

        .container form input {
            height: 100%;
            width: 100%;
            outline: none;
            font-size: 17px;
            padding-left: 20px;
            border: 1px solid lightgrey;
            border-radius: 25px;
            transition: all 0.3s ease;
        }

        .container form input:focus,
        .container form input:valid {
            border-color: #4158d0;
        }

        .container form label {
            position: absolute;
            top: 50%;
            left: 20px;
            color: #999999;
            font-weight: 400;
            font-size: 17px;
            pointer-events: none;
            transform: translateY(-50%);
            transition: all 0.3s ease;
        }

        .container form input:focus ~ label,
        .container form input:valid ~ label,
        .container form input[type="text"]:focus + label,
        .container form input[type="text"]:not(:placeholder-shown) + label {
            top: 0%;
            font-size: 16px;
            color: #4158d0;
            background: #fff;
            transform: translateY(-50%);
        }

        .container form .custom-message {
            color: #ff0000;
        }

        .container form .btn-primary {
            color: #fff;
            border: none;
            padding-left: 0;
            margin-top: 20px;
            font-size: 20px;
            font-weight: 500;
            cursor: pointer;
            background: linear-gradient(-135deg, #c850c0, #4158d0);
            width: 100%;
            border-radius: 0;
            transition: all 0.3s ease;
        }

        .container form .btn-primary:active {
            transform: scale(0.95);
        }
    </style>
</head>
<body>
    <div class="container mt-5">
        <h2>Vérification</h2>
        <form action="Code" method="post">
            <div class="mb-3">
                <input type="text" class="form-control" id="verificationCode" name="verificationCode">
                <label for="verificationCode" class="form-label">Code de Vérification :</label>
            </div>
            <p class="custom-message">${msg}</p>
            <button type="submit" class="btn btn-primary btn-block">Envoyer</button>
        </form>
    </div>
    <script>
        // Add event listener to hide the placeholder when user starts typing
        document.getElementById('verificationCode').addEventListener('input', function () {
            this.setAttribute('data-empty', this.value === '' ? 'true' : 'false');
        });
    </script>
</body>
</html>
