<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Factorial Calculator</title>
    <!-- Bootstrap CDN -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            background: #f7f7f7;
            font-family: 'Segoe UI', sans-serif;
        }
        .container {
            margin-top: 100px;
        }
        .card {
            box-shadow: 0 4px 8px rgba(0,0,0,0.1);
            border-radius: 12px;
        }
        .card-header {
            background-color: #007bff;
            color: white;
            font-size: 24px;
            border-radius: 12px 12px 0 0;
        }
        .btn-primary {
            border-radius: 8px;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card">
                <div class="card-header text-center">
                    Factorial Calculator
                </div>
                <div class="card-body">
                    <form action="getfact">
                        <div class="form-group">
                            <label for="number">Enter a number:</label>
                            <input type="text" class="form-control" id="number" name="number" placeholder="e.g., 5" required>
                        </div>
                        <button type="submit" class="btn btn-primary btn-block">Calculate Factorial</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
