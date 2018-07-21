
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="${pageContext.request.contextPath}/js/echarts.min.js"></script>
<script src="http://cdn-hangzhou.goeasy.io/goeasy.js"></script>
<script>

</script>
<div id="main1" style="width: 600px;height:400px;"></div>

<script>

     var goEasy = new GoEasy({
         appkey: "BC-4be65e4518cf4475a64619932aea9095"
     });
     goEasy.subscribe({
         channel: "lxtchannel",
         onMessage: function (message) {

             var a = JSON.parse(message.content)
             alert(a.data)
             var myChart = echarts.init(document.getElementById('main1'));
             var option = {
                 title: {
                     text: 'ECharts 入门示例'
                 },
                 tooltip: {},
                 legend: {
                     data: ['人数']
                 },
                 xAxis: {
                     data: ["第一周", "第二周", "第三周"]
                 },
                 yAxis: {},
                 series: [{
                     name: '人数',
                     type: 'bar',
                     data: a
                 }]
             };
             myChart.setOption(option);

         }
     });






</script>