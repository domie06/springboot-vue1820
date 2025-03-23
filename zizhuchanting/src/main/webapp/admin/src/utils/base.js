const base = {
    get() {
                return {
            url : "http://localhost:8080/zizhuchanting/",
            name: "zizhuchanting",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/zizhuchanting/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "海鲜自助餐厅系统"
        } 
    }
}
export default base
