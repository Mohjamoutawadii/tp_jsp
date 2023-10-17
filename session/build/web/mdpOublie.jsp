<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Page d'Activation</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap/dist/css/bootstrap.min.css">
    <style>
        body {
            background: linear-gradient(-135deg, #c850c0, #4158d0);
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            align-items: center;
            justify-content: center;
            min-height: 100vh;
            
        }

        .container {
            text-align: center;
            background-color: #ffffff;
            border-radius: 10px;
            box-shadow: 0px 5px 10px rgba(0, 0, 0, 0.1);
            max-width: 600px;
            padding: 40px; /* Increased padding value */
        }

        .title {
            font-size: 35px;
            font-weight: 600;
            color: #fff;
            background: linear-gradient(-135deg, #c850c0, #4158d0);
            border-radius: 10px 10px 0 0;
            padding: 20px;
        }

        .mb-3 {
            margin-bottom: 20px;
        }

        .label {
            font-size: 17px;
            font-weight: 400;
            color: #999999;
            transition: all 0.3s ease;
        }

        .input {
            height: 50px;
            width: 100%;
            outline: none;
            font-size: 17px;
            padding-left: 20px;
            border: 1px solid lightgrey;
            border-radius: 25px;
            transition: all 0.3s ease;
        }

        .input:focus,
        .input:valid {
            border-color: #4158d0;
        }

        .input:focus ~ .label,
        .input:valid ~ .label {
            font-size: 16px;
            color: #4158d0;
            background: #fff;
        }

        .custom-message {
            color: #ff0000; /* Red text color for messages */
        }

        .field {
            background: linear-gradient(-135deg, #c850c0, #4158d0);
            color: #fff;
            border: none;
            font-size: 20px;
            font-weight: 500;
            padding: 15px 0;
            margin-top: 20px;
            border-radius: 0 0 10px 10px;
            cursor: pointer;
            transition: all 0.3s ease;
        }

        .field:hover {
            background: linear-gradient(-135deg, #4158d0, #c850c0);
        }
    </style>
</head>
<body>
    <div class="container">
        <h1 class="title">Page d'Activation</h1>
        <form action="mdpOublie" method="POST">
            <div class="mb-3">
                <label for="email" class="label">Email</label>
                <input type="email" class="input" id="email" name="email" required>
            </div>
            <p class="custom-message">${msg}</p>
            <button type="submit" class="field">Envoyer le Code d'Activation</button>
        </form>
    </div>
</body>
</html>
