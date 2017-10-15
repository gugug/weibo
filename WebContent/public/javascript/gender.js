/**
 * Created by Administrator on 2017/2/15 0015.
 */
function getSexCharacter(girl,boy){
	
var myChart=echarts.init(document.getElementById('gender'));
var option = {
    title:{
        text:'读者性别分布',
        textStyle:{
            color:'#000000',
            fontSize:20,
        },
        textAlign:'left',
    },
    tooltip: {
        trigger: 'item',
        formatter: "{a} <br/>{b}: {c} ({d}%)"
    },
    legend: {
        orient: 'vertical',
        top:'10%',
        x: 'left',
        textStyle:{
            fontSize:15,
            fontWeight:'bold'
        },
        data:['女性','男性']
    },
    color:['#DC3737','#273952'],

    series: [
        {
            name:'性别比例',
            type:'pie',
            radius: ['50%', '70%'],
            avoidLabelOverlap: false,
            label: {
                normal: {
                    show: false,
                    position: 'center'
                },
                emphasis: {
                    show: true,
                    textStyle: {
                        fontSize: '30',
                        fontWeight: 'bold'
                    }
                }
            },
            labelLine: {
                normal: {
                    show: false
                }
            },
            center:['50%','60%'],
            data:[
                {value:girl, name:'女性'},
                {value:boy, name:'男性'}
            ]
        }
    ]
};
myChart.setOption(option);

}