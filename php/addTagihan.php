<?php  
include 'koneksi.php'; 
 
$hasil         = mysqli_query($conn, "UPDATE users SET tagihan=tagihan+'".$_GET['tagihan']."' WHERE username='".$_GET['username']."'") or die(mysql_error());
$json_response = array();

if($hasil){
	$json_response[] = "true";
}else{
	$json_response[] = "false";
}
 
echo json_encode(array('result' => $json_response));
?>