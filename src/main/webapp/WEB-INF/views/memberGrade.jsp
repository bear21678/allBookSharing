<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<!-- <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script> -->
<style>
@import url(//fonts.googleapis.com/earlyaccess/hanna.css);

@import url(//fonts.googleapis.com/earlyaccess/jejugothic.css);

@import url(//fonts.googleapis.com/earlyaccess/notosanskr.css);

@import url(//fonts.googleapis.com/earlyaccess/nanumgothiccoding.css);

table, th, td {
	border: 1px solid #bcbcbc;
	font-size: 20px;
	text-align: center;
}

.tb {
	margin-top: 30px;
}
.subbtn:hover{
background-color:#F0EAD6;
}


</style>
</head>
<body>
	<main>
		<section>
			<div class="container tb">
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th style="text-align: center; width: 100px;">회원등급</th>
							<th scope="col" style="width: 130px; text-align: left;"></th>
						</tr>
					</thead>
					<tbody>

						<tr>
							<th style="width: 100px; text-align: center;">일반회원<img
								src="./images/normal.PNG" width="100px" height="100px"></th>
							<th scope="row" style="width: 130px; text-align: left;">
								-도서대출 최대3권까지 가능<br> -대출하신 책은 2주까지 사용가능하십니다.<br> -대출연장은
								1주일 연장이 가능하십니다.
							</th>
						</tr>

						<tr>
							<th style="width: 100px; text-align: center;">우수회원<img
								src="./images/good.PNG" width="100px" height="100px"></th>
							<th scope="row" style="width: 130px; text-align: left;">
								-도서대출 최대5권까지 가능<br> -대출하신 책은 3주까지 사용가능하십니다.<br> -대출연장은
								2주일 연장이 가능하십니다.<br> -우수회원 달성시 포인트 10000포인트를 지원해드립니다.<br>
							</th>
						</tr>

						<tr>
							<th style="width: 100px; text-align: center;">블랙리스트<img
								src="./images/black.PNG" width="100px" height="100px"></th>
							<th scope="row" style="width: 130px; text-align: left;">
								-연체3회 이상 누적시 적용<br> -책훼손 발견시 새로운 책값을 지불하고 즉시 블랙리스트 적용
							</th>
						</tr>

						<tr>
							<th style="width: 100px; text-align: center; line-height: 101px">우수회원
								기준</th>
							<th scope="row" style="width: 130px; text-align: left;">-도서
								대출30회 이상 이용<br> -독서하신 책에 대한 간단한 한줄평 리뷰 작성<br> -연체가 없으신
								고객님
							</th>
						</tr>

					</tbody>
				</table>
			</div>
		</section>

	</main>


</body>
</html>