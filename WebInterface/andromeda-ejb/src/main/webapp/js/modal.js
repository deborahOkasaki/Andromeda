function toCreateCom(cd){
	document.getElementsByName("resCode")[0].value = cd;
	console.log(cd);
}

function toDeleteCom(cd){
	console.log(cd);
	document.getElementsByName("delRes")[0].value = cd;
}

function toEditRes(cd, nm){
	console.log(nm);
	document.getElementsByName("edResCd")[0].value = cd;
	document.getElementsByName("edResNm")[0].placeholder = nm;
}

function toEditCom(cd, nm){
	console.log(cd);
	document.getElementsByName("edComCd")[0].value = cd;
	document.getElementsByName("edComNm")[0].placeholder = nm;
}