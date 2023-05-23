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
                };

                $.ajax({
                    type: "POST",
                    url: "hello", // Замените "hello" на URL, по которому вы хотите отправить запрос
                    data: formData,
                    success: function(response) {
                        // Обновляем содержимое элементов div
                        $("#nameResult").text("date : " + formData.name);
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
<h2>Alinka Shtrih))</h2>
<form>

    <label for="Date">Date:</label>
    <input type="Date" name="Date" id="Date" required>


    <input type="submit" value="Submit">
</form>

<div id="DateResult"></div> <!— Отображение результата date —>
</body>
</html>