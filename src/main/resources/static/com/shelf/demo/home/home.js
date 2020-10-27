var setting = {
    view: {
        selectedMulti: false,
        showIcon: false,
    },
    edit: {
        editNameSelectAll: true,
    },
    data: {
        simpleData: {
            enable: true
        }
    },
    callback: {
        onClick: zTreeOnClick,
        onRightClick: zTreeOnRightClick
    }
};
var sersCol=[


    '00:15','00:30','00:45','01:00','01:15','01:30','01:45',


    '02:00','02:15','02:30','02:45','03:00','03:15','03:30','03:45',


    '04:00','04:15','04:30','04:45','05:00','05:15','05:30','05:45',


    '06:00','06:15','06:30','06:45','07:00','07:15','07:30','07:45',


    '08:00','08:15','08:30','08:45','09:00','09:15','09:30','09:45',


    '10:00','10:15','10:30','10:45','11:00','11:15','11:30','11:45',


    '12:00','12:15','12:30','12:45','13:00','13:15','13:30','13:45',


    '14:00','14:15','14:30','14:45','15:00','15:15','15:30','15:45',


    '16:00','16:15','16:30','16:45','17:00','17:15','17:30','17:45',


    '18:00','18:15','18:30','18:45','19:00','19:15','19:30','19:45',


    '20:00','20:15','20:30','20:45','21:00','21:15','21:30','21:45',


    '22:00','22:15','22:30','22:45','23:00','23:15','23:30','23:45','24:00'
];
function zTreeOnClick(event, treeId, treeNode) {
    var charMessage={
        url: "/test/getTreeData",
        type: "post",
        async: false,
        data:{
          id:treeNode.id
        },
        dataType: "json",
        success: function (data) {
            creatChartLine(data);
        }
    };
    $.ajax(charMessage);
}
function zTreeOnRightClick(event, treeId, treeNode) {
    alert(treeNode ? treeNode.tId + ", " + treeNode.name : "isRoot");
};
var nodes=[];
//获取树节点
var message={
    url: "/test/getTreeNode",
    type: "post",
    // async: false,
    dataType: "json",
    success: function (data) {
        // nodes=data;
        if(data!=null){
            $.fn.zTree.init($("#treeDemo"), setting, data);
            creatTable();
        }

    }
};
$.ajax(message);

function creatChartLine(data) {
    var type = "";
    if (data) {
        var charts = {
            title: {
                text: '2010 ~ 2016 年太阳能行业就业人员发展情况',
                x:-50
            },
            colors:['#80ea6e'],
            subtitle: {
                text: '数据来源：thesolarfoundation.com'
            },
            xAxis: {
                categories: sersCol
            },
            yAxis: {
                title: {
                    text: '就业人数'
                }
            },
            legend: {
                layout: 'vertical',
                align: 'right',
                verticalAlign: 'middle'
            },
            series: [{
                name: '安装，实施人员',
                data: data
            }
            ]
        };
        $('.cchart').highcharts(charts);
    }
}
function creatTable() {
    layui.use('table', function(){
        var table = layui.table;
        //第一个实例
        table.render({
            elem: '#laTable'
            ,height: 312
            ,url: '/test/getAllData' //数据接口
            // ,page: true //开启分页
            ,cols: [[ //表头
                {field: 'id', title: 'ID', width:150 ,fixed: 'left'}
                ,{field: 'name', title: '用户名', width:180,fixed: 'left'}
                ,{field: 'caseid', title: '日期', width:120,fixed: 'left'}
                ,{field: 'ctype', title: '城市', width:80,fixed: 'left'}
                ,{field: 'h01', title: '00:15', width:80}
                ,{field: 'h02', title: '00:30', width:80}
                ,{field: 'h03', title: '00:45', width:80}
                ,{field: 'h04', title: '01:00', width:80}
                ,{field: 'h05', title: '01:15', width:80}
                ,{field: 'h06', title: '01:30', width:80}
                ,{field: 'h07', title: '01:45', width:80}
                ,{field: 'h08', title: '02:00', width:80}
                ,{field: 'h09', title: '02:15', width:80}

            ]]
        });

    });
}
