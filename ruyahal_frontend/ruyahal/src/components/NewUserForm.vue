<template>
    <div class="new-user">
        <form class="user-form"></form>
    </div>

</template>

<script>
export default {
    data(){
        return {
            user: {
                userId: -1,
                name: "",
                lastname: "",
                age: -1,
                gender: "",
                sexualOrientation: "",
                occupation: "",
                maritalStatus: "",
                zodiacSign:
                religion: "",
                email: "",
                enabled: false
            }
        }
        }
    }
    
</script>

<style>

</style>