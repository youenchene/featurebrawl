<template>
  <div id="app" class="e-content">
    <h2>Submit a new feature</h2>
    <new-feature></new-feature>
    <h2>Submitted Features</h2>
    <feature v-for="feat in allFeatures" :key="feat.id" :feature="feat" class="as--gutter-10"></feature>
  </div>
</template>

<script>
  import { mapActions, mapGetters } from 'vuex';
  import Feature from './components/Feature.vue';
  import NewFeature from './components/NewFeature.vue';

  export default {
    components: {
      NewFeature,
      Feature },
    name: 'app',
    mounted() {
      this.fillAllFeatures();
    },
    computed: {
      ...mapGetters(['allFeatures']),
    },
    methods: {
      ...mapActions(['fillAllFeatures']),
    },
  };
</script>

<style>

</style>
