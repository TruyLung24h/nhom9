<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<title>NewsFeed</title>
<meta charset="utf-8">

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="../static/assets/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="../static/assets/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="../static/assets/css/animate.css">
<link rel="stylesheet" type="text/css" href="../static/assets/css/font.css">
<link rel="stylesheet" type="text/css" href="../static/assets/css/li-scroller.css">
<link rel="stylesheet" type="text/css" href="../static/assets/css/slick.css">
<link rel="stylesheet" type="text/css" href="../static/assets/css/jquery.fancybox.css">
<link rel="stylesheet" type="text/css" href="../static/assets/css/theme.css">
<link rel="stylesheet" type="text/css" href="../static/assets/css/style.css">
<!--[if lt IE 9]>
<script src="assets/js/html5shiv.min.js"></script>
<script src="assets/js/respond.min.js"></script>
<![endif]-->
</head>
<body>
<div id="preloader">
  <div id="status">&nbsp;</div>
</div>
<a class="scrollToTop" href="#"><i class="fa fa-angle-up"></i></a>
<div class="container">
  <header id="header">
    <div class="row">
      
      <div class="col-lg-12 col-md-12 col-sm-12">
        <div class="header_bottom">
          <div class="logo_area"><a href="index.html" class="logo"><img src="../static/images/logo.jpg" alt=""></a></div>
          <div class="add_banner"><a href="#"><img src="../static/images/addbanner_728x90_V1.jpg" alt=""></a></div>
        </div>
      </div>
    </div>
  </header>
  <section id="navArea">
    <nav class="navbar navbar-inverse" role="navigation">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
      </div>
      <div id="navbar" class="navbar-collapse collapse">
        <ul class="nav navbar-nav main_nav">
          <li class="active"><a href="/"><span class="fa fa-home desktop-home"></span><span class="mobile-show">Home</span></a></li>
          <li ><a href="#">Xem Nhiều</a></li>       
          <li><a href="#">Công Nghệ</a></li>    
          <li><a href="#">Thể Thao</a></li>
          <li><a href="pages/contact.html">Giải Trí</a></li>
          <li><a href="pages/404.html">Giáo Dục</a></li>
          <li><a href="/login" >Đăng Nhập</a></li>     
        </ul>
      </div>
    </nav>
  </section>
  
  
  <section id="contentSection">
    <div class="row">
      <div class="col-lg-8 col-md-8 col-sm-8">
        <div class="left_content">
         
         
            <c:forEach var="tintucs" items="${tintucs}">
								 <div class="fashion" style="margin-right:5px">
					              <div class="single_post_content">
					                <h2></h2>
					                <ul class="business_catgnav wow fadeInDown">
					                  <li>
					                    <figure class="bsbig_fig"> <a href="pages/single_page.html" class="featured_img"> 
					                    <img alt="" src="../static/images/${tintucs.hinhanh}"> <span class="overlay"></span> </a>
					                      <figcaption>
					                      <a href="/tintuc/xemchitiet?matintuc=${tintucs.matintuc}">
					                      ${tintucs.tieude}
					                      </a> </figcaption>
					                      <p>${tintucs.noidungnho}</p>
					                    </figure>
					                  </li>
					                </ul>
					                
					              </div>
          			  </div>
					</c:forEach>
         
          
        </div>
      </div>
      
      <div class="col-lg-4 col-md-4 col-sm-4">
        <aside class="right_content">
          <div class="single_sidebar">
            <h2><span>Popular Post</span></h2>
            <ul class="spost_nav">
              <li>
                <div class="media wow fadeInDown"> <a href="pages/single_page.html" class="media-left"> 
                <img alt="" src="../static/images/post_img1.jpg"> </a>
                  <div class="media-body"> <a href="pages/single_page.html" class="catg_title"> Aliquam malesuada diam eget turpis varius 1</a> </div>
                </div>
              </li>
              <li>
                <div class="media wow fadeInDown"> <a href="pages/single_page.html" class="media-left"> <img alt=""
                 src="../static/images/post_img2.jpg"> </a>
                  <div class="media-body"> <a href="pages/single_page.html" class="catg_title"> Aliquam malesuada diam eget turpis varius 2</a> </div>
                </div>
              </li>
              <li>
                <div class="media wow fadeInDown"> <a href="pages/single_page.html" class="media-left"> <img alt="" 
                src="../static/images/post_img1.jpg"> </a>
                  <div class="media-body"> <a href="pages/single_page.html" class="catg_title"> Aliquam malesuada diam eget turpis varius 3</a> </div>
                </div>
              </li>
              <li>
                <div class="media wow fadeInDown"> <a href="pages/single_page.html" class="media-left"> <img alt="" 
                src="../static/images/post_img2.jpg"> </a>
                  <div class="media-body"> <a href="pages/single_page.html" class="catg_title"> Aliquam malesuada diam eget turpis varius 4</a> </div>
                </div>
              </li>
            </ul>
          </div>
          
      
         
        </aside>
      </div>
    </div>
  </section>
  <footer id="footer">
    <div class="footer_top">
      <div class="row">
        <div class="col-lg-4 col-md-4 col-sm-4">
          <div class="footer_widget wow fadeInLeftBig">
            <h2>Flickr Images</h2>
          </div>
        </div>
        <div class="col-lg-4 col-md-4 col-sm-4">
          <div class="footer_widget wow fadeInDown">
            <h2>Tag</h2>
            <ul class="tag_nav">
              <li><a href="#">Games</a></li>
              <li><a href="#">Sports</a></li>
              <li><a href="#">Fashion</a></li>
              <li><a href="#">Business</a></li>
              <li><a href="#">Life &amp; Style</a></li>
              <li><a href="#">Technology</a></li>
              <li><a href="#">Photo</a></li>
              <li><a href="#">Slider</a></li>
            </ul>
          </div>
        </div>
        <div class="col-lg-4 col-md-4 col-sm-4">
          <div class="footer_widget wow fadeInRightBig">
            <h2>Contact</h2>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>
            <address>
            Perfect News,1238 S . 123 St.Suite 25 Town City 3333,USA Phone: 123-326-789 Fax: 123-546-567
            </address>
          </div>
        </div>
      </div>
    </div>
    <div class="footer_bottom">
      <p class="copyright">Copyright &copy; 2045 <a href="index.html">NewsFeed</a></p>
      <p class="developer">Developed By Wpfreeware</p>
    </div>
  </footer>
</div>
<script src="../static/assets/js/jquery.min.js"></script> 
<script src="../static/assets/js/wow.min.js"></script> 
<script src="../static/assets/js/bootstrap.min.js"></script> 
<script src="../static/assets/js/slick.min.js"></script> 
<script src="../static/assets/js/jquery.li-scroller.1.0.js"></script> 
<script src="../static/assets/js/jquery.newsTicker.min.js"></script> 
<script src="../static/assets/js/jquery.fancybox.pack.js"></script> 
<script src="../static/assets/js/custom.js"></script>
</body>
</html>