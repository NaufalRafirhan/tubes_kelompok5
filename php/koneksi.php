<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "kel5android";
// buat koneksi
$conn = mysqli_connect($servername, $username, $password, $dbname);
// cek koneksi
if (!$conn) {
	echo "Connection gagal";
}else{

}
?>