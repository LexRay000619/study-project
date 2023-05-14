<template>
    <div style="width: 100vw;height: 100vh;overflow: hidden;display: flex">
        <div style="flex: 1">
            <el-image style="width: 100%;height: 100%" fit="cover"
                      src="https://img.zcool.cn/community/01b28158b18eb3a801219c774bcd07.jpg@1280w_1l_2o_100sh.jpg"/>
        </div>
        <div class="welcome-title">
            <div style="font-size: 30px;font-weight: bold">欢迎来到我们的学习平台</div>
            <div style="margin-top: 10px">在这里你可以学习如何使用Java、如何搭建网站，并且与Java之父密切交流</div>
        </div>
        <div style="width: 400px;background-color: white;z-index: 1">
            <router-view v-slot="{ Component }">
                <transition name="el-fade-in-linear" mode="out-in">
                    <component :is="Component" style="height: 100%"/>
                </transition>
            </router-view>
        </div>
    </div>
</template>

<script>

</script>

<style scoped>
.welcome-title {
    position: absolute;
    bottom: 30px;
    left: 30px;
    color: white;
    text-shadow: 0 0 10px black;
}
</style>