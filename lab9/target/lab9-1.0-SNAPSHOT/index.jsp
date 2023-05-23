<!DOCTYPE html>
<html>
<head>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script>
        $(document).ready(function() {
            $("form").submit(function(event) {
                event.preventDefault(); // Предотвращаем отправку формы по умолчанию

                var formData = {
                    name: $("#name").val(),
                    email: $("#email").val()
                };

                $.ajax({
                    type: "POST",
                    url: "hello", // Замените "hello" на URL, по которому вы хотите отправить запрос
                    data: formData,
                    success: function(response) {
                        // Обновляем содержимое элементов div
                        $("#nameResult").text("Name: " + formData.name);
                        $("#emailResult").text("Email: " + formData.email);
                    },
                    error: function(error) {
                        console.log(error); // Обработка ошибки
                    }
                });
            });
        });
    </script>
</head>
<body>
<h2>Alinka Shtrih))♥</h2>
<form>

    <label for="date">Date:</label>
    <input type="date" name="date" id="date" required>


    <input type="submit" value="Submit">
</form>

<div id="dateResult"></div> <!— Отображение результата date —>
</body>
</html>