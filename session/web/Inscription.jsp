<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inscription</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins:400,500,600,700&display=swap">

    <style>
        @import url('https://fonts.googleapis.com/css?family=Poppins:400,500,600,700&display=swap');

        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Poppins', sans-serif;
        }

        html,
        body {
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

        .wrapper {
            width: 380px;
            background: #fff;
            border-radius: 15px;
            box-shadow: 0px 15px 20px rgba(0, 0, 0, 0.1);
        }

        .wrapper .title {
            font-size: 35px;
            font-weight: 600;
            text-align: center;
            line-height: 100px;
            color: #fff;
            user-select: none;
            border-radius: 15px 15px 0 0;
            background: linear-gradient(-135deg, #c850c0, #4158d0);
        }

        .wrapper form {
            padding: 10px 30px 50px 30px;
        }

        .wrapper form .field {
            height: 50px;
            width: 100%;
            margin-top: 20px;
            position: relative;
        }

        .wrapper form .field input {
            height: 100%;
            width: 100%;
            outline: none;
            font-size: 17px;
            padding-left: 20px;
            border: 1px solid lightgrey;
            border-radius: 25px;
            transition: all 0.3s ease;
        }

        .wrapper form .field input:focus,
        .wrapper form .field input:valid {
            border-color: #4158d0;
        }

        .wrapper form .field label {
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

        .wrapper form .field input:focus ~ label,
        .wrapper form .field input:valid ~ label,
        .wrapper form .field input:placeholder-shown ~ label {
            top: 0%;
            font-size: 16px;
            color: #4158d0;
            background: #fff;
            transform: translateY(-50%);
        }

        .wrapper form .content {
            display: flex;
            width: 100%;
            height: 50px;
            font-size: 16px;
            align-items: center;
            justify-content: space-around;
        }

        .wrapper form .content .checkbox {
            display: flex;
            align-items: center;
            justify-content: center;
        }

        .wrapper form .content input {
            width: 15px;
            height: 15px;
            background: red;
        }

        .wrapper form .content label {
            color: #262626;
            user-select: none;
            padding-left: 5px;
        }

        .wrapper form .content .pass-link {
            color: "";
        }

        .btn-primary{
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

        .wrapper form .field input[type="submit"]:active {
            transform: scale(0.95);
        }
    </style>
</head>

<body>
    <div class="wrapper">
        <div class="title">Inscription</div>
        <form action="Inscription" method="post">
            <div class="field">
                <input type="text" id="nom" name="nom" required>
                <label for="nom">Nom :</label>
            </div>
            <div class="field">
                <input type="text" id="prenom" name="prenom" required>
                <label for="prenom">Pr�nom :</label>
            </div>
            <div class="field">
                <input type="email" id="email" name="email" required>
                <label for="email">Email :</label>
            </div>
            <div class="field">
                <input type="password" id="motdepasse" name="motdepasse" required>
                <label for="motdepasse">Mot de passe :</label>
            </div>
            <div class="field">
                <input type="date" name="date" value="">
                <label for="date">Date :</label>
            </div>
            <input type="submit" value="Valider" class="btn-primary">
        </form>
    </div>
</body>

</html>
