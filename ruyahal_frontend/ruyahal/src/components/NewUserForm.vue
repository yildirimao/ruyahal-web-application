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
                dateOfBirth: "",
                gender: "",
                sexualOrientation: "",
                occupation: "",
                maritalStatus: "",
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