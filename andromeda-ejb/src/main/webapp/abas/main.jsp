<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Andromeda - Minhas Residências</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/andromeda.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/abas/residencia.css">

    <link rel="icon" href="img/houses.png">

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>

<body>
    ${username}
    <div class="container-fluid">
            <!-- lista de residencias -->
            <div class="row">

                <!-- residencia -->
                <div class="col-sm col col-md-6 col-lg-5 col-xl-4">
                    <div class="accordion" id="res01">
                        <div class="res-card">
                            <div class="res-header" id="reshead01">
                                <a class="res-toggle" data-toggle="collapse" data-target="#collapseRes"
                                    aria-expanded="true" aria-controls="collapseRes">
                                    <div class="res-info">
                                        <span class="res-name">#Principal</span>
                                        <br />
                                        <span class="res-desc">4 cômodos, média R$70,00/mês</span>
                                    </div>
                                </a>
                            </div>

                            <div id="collapseRes" class="collapse hide" aria-labelledby="reshead01"
                                data-parent="#res01">
                                <div class="accordion com-list" id="res01-comlist">
                                    <div class="com-card">
                                        <div class="com-header" id="res01-comheader01">
                                            <a class="com-toggle" data-toggle="collapse"
                                                data-target="#collapse-res01-com01" aria-expanded="true"
                                                aria-controls="collapse-res01-com01">
                                                <div class="com-icon"></div>
                                                <div class="com-info">
                                                    <span class="com-name">#Principal</span>
                                                    <br />
                                                    <span class="com-desc">4 cômodos, média R$70,00/mês</span>
                                                </div>
                                            </a>
                                        </div>

                                        <div id="collapse-res01-com01" class="collapse hide ap-list"
                                            aria-labelledby="res01-com01-apheader" data-parent="#res01-com01-ap">
                                            <div class="accordion ap-list" id="res01-com01-ap">
                                                <div class="ap-card">
                                                    <div class="ap-header" id="res01-com01-apheader">
                                                        <div class="searchbar">
                                                            <input type="text"
                                                                placeholder="Digite o modelo do aparelho..." />
                                                            <img src="" />
                                                        </div>
                                                        <div class="ap-list">
                                                            <div class="ap-item">
                                                                <div class="ap-display">
                                                                    <div class="ap-icon"></div>
                                                                    <div class="ap-desc">
                                                                        <span class="ap-name">Monitor LED 24”</span>
                                                                        <br/>
                                                                        <span class="ap-desc">Consumo R$0.70/hora. Gasto estimado: R$15,00/mês</span>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="footer">
                                                            <button class="btn salvar">salvar</button>
                                                            <button class="btn cancelar">cancelar</button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    </div>

    <!-- JAVASCRIPT -->

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>

</html>