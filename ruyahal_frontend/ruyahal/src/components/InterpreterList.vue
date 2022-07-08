<template>
  <div>
    <h1>Interpreters</h1>
    <p class="interpreter-list" v-for="interpreter in this.$store.state.interpreters" :key="interpreter.id" v-bind:to="{ name: 'interpreter-list', params:{id:interpreter.id}}">{{interpreter.age}}</p>
  </div>
</template>

<script>
export default {
    
    check: false,
    created() {
        if(!this.check){
        this.$store.commit("LIST_INTERPRETERS");
        }
}
}
</script>

<style>

</style>